package com.btl.n8.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HomeController {

    @FXML
    private Label usernameLabel;

    @FXML
    private Label balanceLabel;

    @FXML
    private Button sellItemBtn;

    @FXML
    private TableView<?> auctionTable;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colItemName;

    @FXML
    private TableColumn<?, ?> colCategory;

    @FXML
    private TableColumn<?, ?> colCurrentPrice;

    @FXML
    private TableColumn<?, ?> colEndTime;

    @FXML
    private TableColumn<?, ?> colAction;

    @FXML
    public void initialize() {
        // Initialization logic for UI components
    }

    @FXML
    private void handleLogout(ActionEvent event) {
        // Action for logging out
    }

    @FXML
    private void handleRefresh(ActionEvent event) {
        // Action for refreshing the auction table
    }

    @FXML
    private void handleOpenSellScreen(ActionEvent event) {
        // Action for opening the sell item screen
    }
}