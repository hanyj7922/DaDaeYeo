package com.hanyj96.dadaeyeo.di;

import androidx.lifecycle.ViewModel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import dagger.MapKey;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@MapKey
@SuppressWarnings("unused")
public @interface ViewModelKey {
    Class<? extends ViewModel> value();
}
