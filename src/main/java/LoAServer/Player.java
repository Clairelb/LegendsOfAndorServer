package LoAServer;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String username;
    private String password;
    private String color;
    private Hero hero;
    private int willPower;
    private int strength;
    private int currentSpace;
    private boolean hasEndedDay;
    private boolean isLoggedIn;

    public Player() {
    }

    public Player(String username, String password, String color, boolean isLoggedIn) {
        this.username = username;
        this.password = password;
        this.color = color;
        this.isLoggedIn = isLoggedIn;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isLoggedIn() {
        return isLoggedIn;
    }
    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public Hero getHero() {
        return hero;
    }
    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
