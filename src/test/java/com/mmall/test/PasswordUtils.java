package com.mmall.test;

/**
 * Created by wang on 2017/9/8.
 */
import java.lang.annotation.*;




@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
 @interface UseCase{
    public int id();
    public String derc() default "no description";
}

public class PasswordUtils{
    @UseCase(id = 47, derc = "password 47")
    public boolean validatePassword(String password){
        return true;
    }
    public static void main(String[] args){

    }


}
