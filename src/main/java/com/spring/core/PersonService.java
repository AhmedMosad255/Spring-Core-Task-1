package com.spring.core;

public class PersonService implements UserService{
    @Override
    public void save(String name) {
        System.out.println("Saving..." + name);
    }

    @Override
    public void update(String name) {
        System.out.println("Updating..." + name);
    }
}
