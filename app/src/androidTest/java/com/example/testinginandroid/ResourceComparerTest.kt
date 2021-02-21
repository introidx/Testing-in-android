package com.example.testinginandroid

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test


class ResourceComparerTest{

    // create an instance of ResourceComparer class
    private lateinit var  resourceComparer : ResourceComparer

    // by using @Before ..it will execute this method first
    // we can also initialize ResourceComparer object in each of the methods but that will create many boilerplate code
    // so annotate it with @Before in order to execute it first
    @Before
    fun setUp(){
        resourceComparer = ResourceComparer()
    }

    // in the same way we can also use @After before the method that we want to execute later

    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name , "TestingInAndroid")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context , R.string.app_name , "Hello")
        assertThat(result).isFalse()
    }
    
}