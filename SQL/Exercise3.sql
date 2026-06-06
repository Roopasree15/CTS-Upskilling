SELECT
    u.user_id,
    u.full_name,
    u.email
FROM Users u
LEFT JOIN Registrations r
    ON u.user_id = r.user_id
WHERE r.registration_date < '2025-04-01'
   OR r.registration_date IS NULL;