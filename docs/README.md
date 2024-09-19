# Skibidi User Guide

## Overview

Skibidi is a task management application that helps you keep track of your tasks, deadlines, and events. You can add tags to your tasks for better organization and search for tasks based on these tags.

![Skibidi bot](./Ui.png)

## Features

### Adding Tasks

#### Adding a ToDo

To add a ToDo task, use the `todo` command followed by the task description.

Example:
```
todo Read a book
```

#### Adding a Deadline

To add a Deadline task, use the `deadline` command followed by the task description and the due date.

Example:
```
deadline Submit assignment /by 2024-09-22 00:00
```

#### Adding an Event

To add an Event task, use the `event` command followed by the task description, start date, and end date.

Example:
```
event Birthday party /from 2024-09-18 18:00 /to 2024-09-19 19:00
```

### Managing Tasks

#### Marking a Task as Done

To mark a task as done, use the `mark` command followed by the task number.

Example:
```
mark 1
```

#### Unmarking a Task

To unmark a task, use the `unmark` command followed by the task number.

Example:
```
unmark 1
```

#### Deleting a Task

To delete a task, use the `delete` command followed by the task number.

Example:
```
delete 1
```

### Tagging Tasks

#### Adding a Tag

To add a tag to a task, use the `tag` command followed by the task number and the tag name.

Example:
```
tag 1 important
```

#### Removing a Tag

To remove a tag from a task, use the `untag` command followed by the task number and the tag name.

Example:
```
untag 1 important
```

### Viewing Tasks

#### Listing All Tasks

To list all tasks, use the `list` command.

Example:
```
list
```

#### Finding Tasks by Keyword

To find tasks by keyword, use the `find` command followed by the keyword.

Example:
```
find book
```

### Exiting the Application

To exit the application, use the `bye` command.

Example:
```
bye
```

## Examples

### Adding Deadlines

Example:
```
deadline Submit assignment /by 2024-09-22T00:00
```

Expected outcome:
```
Got it. I've added this task:
  [D][ ] Submit assignment (by: Sep 22 2024)
Now you have X tasks in the list.
```

### Adding Tags

Example:
```
tag 1 important
```

Expected outcome:
```
Added tag to task:
  [T][ ] Read a book [#important]
```

### Removing Tags

Example:
```
untag 1 important
```

Expected outcome:
```
Removed tag from task:
  [T][ ] Read a book
```