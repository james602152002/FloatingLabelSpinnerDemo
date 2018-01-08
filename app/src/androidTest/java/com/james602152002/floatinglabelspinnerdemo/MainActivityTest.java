package com.james602152002.floatinglabelspinnerdemo;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by shiki60215 on 18-1-8.
 */
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);
    private MainActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = mActivityTestRule.getActivity();
    }

    @Test
    public void testLaunch() {
        View view = activity.findViewById(R.id.spinner);

        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        activity = null;
    }

}