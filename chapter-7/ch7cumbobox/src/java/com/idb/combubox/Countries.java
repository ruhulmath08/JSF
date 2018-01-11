/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.idb.combubox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author J2EE-33
 */
public class Countries {
    private static Countries instance = new Countries();
    
    private List countries =new ArrayList();
    
    private Countries(){
        init();
    }
    
    private void init(){
        countries.add(new Country(1, "Bangladesh"));
        countries.add(new Country(2, "India"));
        countries.add(new Country(3, "Pakisthan"));
        countries.add(new Country(4, "England"));
    }
    
    public static Countries getInstance(){
        return  instance;
    }

    public List getCountries() {
        return countries;
    }
    
    public Collection getCountrys(){
        return  Collections.unmodifiableCollection(countries);
    }
}
