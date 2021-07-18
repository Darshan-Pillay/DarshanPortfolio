package co.za.darshanpillay.darshanportfolio.util.logger.impl;

import android.util.Log;

import androidx.annotation.NonNull;

import co.za.darshanpillay.darshanportfolio.util.logger.Logger;

public class LoggerImpl implements Logger {
    private static final String INTERNAL_TAG = "Internal Logger";
    @Override
    public void logMethod(@NonNull String message) {
        Log.d(INTERNAL_TAG, message);
    }
}
