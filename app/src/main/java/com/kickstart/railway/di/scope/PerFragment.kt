package com.kickstart.railway.di.scope

import javax.inject.Scope

/**
 * Scoping annotation which allows objects - whose lifetime conforms to the
 * life of an activity - to be persisted in the correct component.
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class PerFragment

