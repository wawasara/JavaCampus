package com.hawaso.javacampus.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hawaso.javacampus.models.Version;

@RestController
@RequestMapping("/api/versions")
public class VersionsController {
    @GetMapping
    public List<Version> getAll() {
        List<Version> versions = new ArrayList<>();

        var version1 = new Version();
        version1.setId(1L);
        version1.setTitle("Start");
        versions.add(version1);

        versions.add(new Version(2L, "End"));
        return versions;
    }
}
