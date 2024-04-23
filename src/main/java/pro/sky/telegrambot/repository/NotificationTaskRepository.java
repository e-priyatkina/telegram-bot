package pro.sky.telegrambot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.telegrambot.entity.NotificationTask;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Long> {


    Object save(NotificationTask notificationTask);

    List<NotificationTask> findAllByNotificationDateTime(LocalDateTime dateTime);
}
