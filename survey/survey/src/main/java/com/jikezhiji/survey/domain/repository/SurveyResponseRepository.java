package com.jikezhiji.survey.domain.repository;

import com.jikezhiji.survey.domain.SurveyResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by E355 on 2016/11/27.
 */
@RepositoryRestResource(exported = false)
public interface SurveyResponseRepository extends JpaRepository<SurveyResponse,Long> {
}
