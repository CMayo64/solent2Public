/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.oodd.cart.service.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.solent.com504.oodd.cart.model.service.ShoppingCart;
import org.solent.com504.oodd.cart.service.ServiceObjectFactory;

/**
 *
 * @author cgallen
 */
public class ShoppingCartTest {

    ShoppingCart shoppingCart = null;

    @Before
    public void before() {
        shoppingCart = ServiceObjectFactory.getNewShoppingCart();

    }

    @Test
    public void test1() {
        assertNotNull(shoppingCart);
    }

    // add your own tests here
}
