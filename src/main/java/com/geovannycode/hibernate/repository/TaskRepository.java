package com.geovannycode.hibernate.repository;

import com.geovannycode.hibernate.dto.TaskDTO;
import com.geovannycode.hibernate.model.TasksList;
import io.vertx.core.Future;

import java.util.Optional;

public interface TaskRepository {

    Future<TaskDTO> createTask (TaskDTO taskDTO);

    Future<TaskDTO> updateTask (TaskDTO taskDTO);

    Future<Void> removeTask (Integer id);

    Future<Optional<TaskDTO>> findTaskById (Integer id);

    Future<TasksList> findTasksByUser (Integer userId);
}
