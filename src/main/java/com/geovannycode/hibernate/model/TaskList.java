package com.geovannycode.hibernate.model;

import com.geovannycode.hibernate.dto.TaskDTO;

import java.util.List;

public record TaskList(List<TaskDTO> tasks) {
}
