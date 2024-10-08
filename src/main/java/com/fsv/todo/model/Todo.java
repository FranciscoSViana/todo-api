package com.fsv.todo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String description;

    @Column
    private Boolean done;

    @Column
    @JsonFormat(pattern = "dd/MM/yyy HH:mm")
    private LocalDateTime createdDate;

    @Column
    @JsonFormat(pattern = "dd/MM/yyy HH:mm")
    private LocalDateTime doneDate;

    @PrePersist
    public void beforeSaved() {
        setCreatedDate(LocalDateTime.now());
    }
}
