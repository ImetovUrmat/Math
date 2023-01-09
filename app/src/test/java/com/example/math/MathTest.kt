package com.example.math

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MathTest  {

    var math: Math?= null

    @Before
    fun install(){
        math = Math()
    }

    @Test
    fun simpleAddCase(){
        assertEquals("5",math?.add("2", "3"))
    }

    @Test
    fun checkEmpty(){
        assertEquals("Вы не заполнили одно из полей", math?.add("","4"))
    }

    @Test
    fun checkNumber(){
      assertEquals("Нельзя сложить строку", math?.add("a", "b"))
    }

    @Test
    fun doubleAddCase(){ // ДЗ
        assertEquals("4.0", math?.add("2.0", "2.0"))
    }

    @Test
    fun simpleNegativeAddCase(){ // ДЗ
        assertEquals("Нельзя складывать отрицательные числа", math?.add("-2", "-2"))

    }
    @After
    fun detach(){
        math = null

    }

}