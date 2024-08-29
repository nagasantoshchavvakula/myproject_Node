package com.example.Assignment.Node.controller;


import com.example.Assignment.Node.entity.NodeEntity;
import com.example.Assignment.Node.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/nodes")
public class NodeController {

    @Autowired
    private NodeService nodeService;

    @PostMapping (value="/createNodes") //http://localhost:8080/nodes/createNodes
    public ResponseEntity<NodeEntity> addNode(@Validated @RequestBody NodeEntity node) {
        NodeEntity savedNode = nodeService.saveNode(node);
        return new ResponseEntity<>(savedNode, HttpStatus.CREATED);
    }

    @GetMapping (value="/getNodes") //http://localhost:8080/nodes/getNodes
    public ResponseEntity<List<NodeEntity>> getAllNodes() {
        List<NodeEntity> nodes = nodeService.getAllNodes();
        return new ResponseEntity<>(nodes, HttpStatus.OK);
    }

}
