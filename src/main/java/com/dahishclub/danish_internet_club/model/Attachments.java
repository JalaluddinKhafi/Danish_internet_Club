package com.dahishclub.danish_internet_club.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.File;
import java.util.Date;

@Data
@Entity
public class Attachments {
    @Id
    Long id;
    String title;
    String description;
    File attachment;
    Date created_at;
}
