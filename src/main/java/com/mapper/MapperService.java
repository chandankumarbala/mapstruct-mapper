package com.mapper;


import com.mapper.pojo.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperService {

    @Mappings(
            {
               @Mapping(target="aloneDist", source="source.alone"),
                    @Mapping(target = "accountsDest", source = "source.accounts"),
                    @Mapping(target = "accountsDest2", source = "source.accounts2")
            }
    )
    public Destination mapSourceTOdestination(Source source);


    @Mappings(
            {
                    @Mapping(target="destNested", source="source.soirceNested"),
                    @Mapping(target="d1", source="source.s")
            }
    )
    public DestNested mapNestedDest(SourceNested source) ;

    public List<DestNested> mapNestedDestList(List<SourceNested> source) ;


    @Mappings(
            {
                    @Mapping(target="destNested2", source="source.soirceNested2"),
                    @Mapping(target="d2", source="source.s2")
            }
    )
    public DestNested2 mapNestedDest2(SourceNested2 source) ;

    public List<DestNested2> mapNestedDestList2(List<SourceNested2> source) ;



}
