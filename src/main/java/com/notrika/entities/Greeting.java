package com.notrika.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Greeting {
    public Greeting(String foo, String bar, String baz) {
        this.foo = foo;
        this.bar = bar;
        this.baz = baz;
    }

    @SerializedName("foo")
    @Expose
    public String foo;
    @SerializedName("bar")
    @Expose
    public String bar;
    @SerializedName("baz")
    @Expose
    public String baz;
}
