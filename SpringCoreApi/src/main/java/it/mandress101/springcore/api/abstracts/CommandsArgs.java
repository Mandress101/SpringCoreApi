package it.mandress101.springcore.api.abstracts;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CommandsArgs {

    String name();

    String permission() default "";

    String[] aliases() default {};

    boolean inGameOnly() default true;

    boolean async() default false;

}
