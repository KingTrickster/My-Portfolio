package com.trxjster.portfoliobackend.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Entity @Data
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ElementCollection(targetClass = ProgrammingLanguage.class)
//    @JoinTable(name = "tblInterests", joinColumns = @JoinColumn(name = "personID"))
//    @Column(name = "interest", nullable = false)
    @Enumerated(EnumType.STRING)
    private List<ProgrammingLanguage>  languages;

    private String repoLink;

    @ElementCollection(targetClass=String.class)
    private List<String> imagesLinks;

    @Column(nullable = true)
    private String hostedProjectLink;

    public Optional<String> getHostedProjectLink() {
        return Optional.ofNullable(hostedProjectLink);
    }

}
