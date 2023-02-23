package com.example.archi.controller;

import com.example.archi.model.Tekateki;
import com.example.archi.service.TekatekiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("tekateki")
public class TekatekiController {

    @Autowired
    TekatekiService tekatekiService;

    @GetMapping("")
    List<Tekateki> getTekateki(){
        return tekatekiService.getTekateki();
    }

    @GetMapping("/{id}")
    public Tekateki getTekateki(@PathVariable("id") Long id) {
        return tekatekiService.getTekateki(id);
    }

    @PostMapping(value = "")
    public Map<String, Object> createTekateki (@RequestParam(value = "id") Long id,
    @RequestParam(value = "question") String question, @RequestParam(value= "answer") String answer) {

        tekatekiService.createTekateki(id,question, answer);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", "Tekateki added!");
        return map;
    }

    @PutMapping(value= "")
    public Tekateki updateTekatekiUsingJson(@RequestBody Tekateki tekateki) {
        tekatekiService.updateTekateki(tekateki);
        return tekateki;
    }

    @DeleteMapping("/{id}")
    public Map<String, Object> deleteProduct(@PathVariable("id") Long id) {
        tekatekiService.deleteTekateki(id);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", "Product deleted!");
        return map;
    }
}
