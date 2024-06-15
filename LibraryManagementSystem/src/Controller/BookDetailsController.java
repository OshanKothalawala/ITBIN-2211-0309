/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.BookModel;
import View.BookDetails;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class BookDetailsController {
    
    private BookDetails view;

    public BookDetailsController(BookDetails view) {
        this.view = view;
    }

    public void retrieveBookDetails(String bookName) {
        ResultSet rs = BookModel.retrieveBookDetails(bookName);
        if (rs != null) {
            try {
                // If a record is found, populate the text fields
                if (rs.next()) {
                    view.setAvailability(rs.getString("availability"));
                    view.setBorrowedDate(rs.getString("borroweddate"));
                    view.setReturnDate(rs.getString("returndate"));
                } else {
                    // If no record is found, clear the text fields
                    view.setAvailability("");
                    view.setBorrowedDate("");
                    view.setReturnDate("");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


