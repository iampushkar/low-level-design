## 🧧 Problem Statement

We need to design a flexible **Notification System** that can:

- Support various **types of notifications** like Alerts, Promotions, Reminders, etc.
- Deliver notifications via multiple **channels** such as Email, SMS, Push, WhatsApp, etc.
- Avoid class explosion caused by every possible combination, such as `EmailAlert`, `SMSPromotion`, `PushReminder`, etc.
- Enable **scalability** for future extension of new notification types or sending methods without modifying existing code.

The solution should promote **loose coupling**, follow the **Open/Closed Principle**, and support **runtime flexibility** in pairing different notification types with different delivery mechanisms.
