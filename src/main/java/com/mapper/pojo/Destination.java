package com.mapper.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString
public class Destination {


    private String aloneDist;

    private List<DestNested> accountsDest=new ArrayList<>();
    private List<DestNested2> accountsDest2=new ArrayList<>();
}
