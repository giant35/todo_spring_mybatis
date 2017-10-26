/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.todo2;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author sihai
 */
public class Todo {

    int id;
    @NotNull
    String title;
    boolean isFinish;
    @Min(1)
    int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isIsFinish() {
        return isFinish;
    }

    public void setIsFinish(boolean isFinish) {
        this.isFinish = isFinish;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Todo{" + "id=" + id + ", title=" + title + ", isFinish=" + isFinish + ", userId=" + userId + '}';
    }
    
}
