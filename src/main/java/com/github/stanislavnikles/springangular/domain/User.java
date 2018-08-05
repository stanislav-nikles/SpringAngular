package com.github.stanislavnikles.springangular.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @Builder
@Table(name = "users")
@NoArgsConstructor @AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "full_name")
    FullName name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address")
    Address address;

    @Column(name = "photo")
    String photo;
}
