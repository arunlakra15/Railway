package com.kickstart.application.di.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Scoping annotation which allows objects - whose lifetime conforms to the
 * life of an activity - to be persisted in the correct component.
 */
@Scope
@Retention(RUNTIME)
public @interface PerActivity { }
