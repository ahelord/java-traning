package com.ahelord.herenciaTest;

public class ProfileTypeFactory {
    public static Profile createProfile(ProfileType profileType){
        return switch (profileType) {
            case BOSS -> new Boss();
            case MEMBER -> new Member();
        };
    }
}
