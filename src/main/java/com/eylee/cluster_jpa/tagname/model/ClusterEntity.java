package com.eylee.cluster_jpa.tagname.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="cluster_test")
public class ClusterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer plant;

    @Column
    private String tagname;

    @Column
    private String alias;


}
