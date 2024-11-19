package com.anagha.CRUDApplication.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity // this class would be a table as well
@Table(name="Books") // renaming the table as Books
//lombok - reduce boilerplate code like constructors(no argument, parameterized), getters and setters
@NoArgsConstructor
@AllArgsConstructor // all will be used to create constructors
@Getter
@Setter
@ToString
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String author;
}
