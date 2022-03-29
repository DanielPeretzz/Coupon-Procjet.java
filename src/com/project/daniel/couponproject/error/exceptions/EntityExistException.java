package com.project.daniel.couponproject.error.exceptions;

import com.project.daniel.couponproject.enums.EntityType;

public class EntityExistException extends  ApplicationException{

    public EntityExistException(EntityType entityType){

        super("This " + entityType + " is already exists!");
    }
}
