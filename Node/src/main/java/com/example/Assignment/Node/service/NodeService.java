package com.example.Assignment.Node.service;

import com.example.Assignment.Node.entity.NodeEntity;
import com.example.Assignment.Node.repository.NodeRepository;
import org.apache.kafka.common.errors.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeService {

    @Autowired
    private NodeRepository nodeRepository;

    public NodeEntity saveNode(NodeEntity node) {
        return nodeRepository.save(node);
    }

    public List<NodeEntity> getAllNodes() {
        return nodeRepository.findAll();
    }

}

