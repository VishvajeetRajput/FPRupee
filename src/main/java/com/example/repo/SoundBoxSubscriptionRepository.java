package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.SoundBoxSubscription;

@Repository
public interface SoundBoxSubscriptionRepository extends JpaRepository<SoundBoxSubscription, Long> {

	//boolean existsById(long id);

}
