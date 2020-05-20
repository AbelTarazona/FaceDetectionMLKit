package com.company.facedetectionml;

import android.app.Application;

import com.google.firebase.FirebaseApp;

/**
 * Creado por abeltarazona el 5/20/20
 */
public class SubApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
