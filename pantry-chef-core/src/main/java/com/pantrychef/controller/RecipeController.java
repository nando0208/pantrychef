package com.pantrychef.controller;

import com.pantrychef.model.ImmutableRecipe;
import com.pantrychef.model.Recipe;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(name="/recipes")
public class RecipeController {

    public List<Recipe> get (
        @RequestParam(name = "components", required = false) String components,
        @RequestParam(name = "limit", required = false, defaultValue = "50") Integer limit,
        @RequestParam(name = "offset", required = false, defaultValue = "1") Integer offset){

        List<Recipe> recipes = null;
        return recipes;
    }

    @RequestMapping(name="/{id}")
    public Recipe get (
            @PathVariable(value = "id") UUID id){
        Recipe recipe = ImmutableRecipe.builder().id(new UUID(1,21)).build();
        return recipe;
    }
}