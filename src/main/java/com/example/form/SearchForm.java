package com.example.form;

public class SearchForm {
    private String searchName;

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    @Override
    public String toString() {
        return "SearchForm{" +
                "searchName='" + searchName + '\'' +
                '}';
    }
}
