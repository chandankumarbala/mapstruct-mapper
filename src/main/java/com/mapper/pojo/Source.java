package com.mapper.pojo;



import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;



@Getter
@Setter
public class Source {

    private String alone;

    private List<SourceNested> accounts=new ArrayList<>();
    private List<SourceNested2> accounts2=new ArrayList<>();
;
}
