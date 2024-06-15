/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.CategoryModel;
import View.CategoryView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class CategoryController {
    private CategoryModel model;
    private CategoryView view;

    public CategoryController(CategoryModel model, CategoryView view) {
        this.model = model;
        this.view = view;

        this.view.addBackButtonListener(new BackButtonListener());
        this.view.addNextButtonListener(new NextButtonListener());
    }

    class BackButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Handle back button action
            System.out.println("Back button clicked");
        }
    }

    class NextButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Handle next button action
            model.setName(view.getCategoryText());
            System.out.println("Next button clicked, Category set to: " + model.getName());
        }
    }

    public static void main(String[] args) {
        CategoryModel model = new CategoryModel("Default Category");
        CategoryView view = new CategoryView();
        CategoryController controller = new CategoryController(model, view);
        view.setVisible(true);
    }
}

    
