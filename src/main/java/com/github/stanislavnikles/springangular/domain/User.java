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

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "full_name_id")
    FullName name;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id")
    Address address;
}
