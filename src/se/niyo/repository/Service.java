package se.niyo.repository;

public class Service {

    Database database;

    public Service(Database database) {
        this.database = database;
    }

    public void handle(String url) {
        var database = new Database();
        database.getAll();
    }
}
