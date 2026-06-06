SELECT
    e.event_id,
    e.title,
    ROUND(
        AVG(
            TIMESTAMPDIFF(
                MINUTE,
                s.start_time,
                s.end_time
            )
        ),
        2
    ) AS average_duration_minutes
FROM Events e
JOIN Sessions s
    ON e.event_id = s.event_id
GROUP BY e.event_id, e.title
ORDER BY average_duration_minutes DESC;