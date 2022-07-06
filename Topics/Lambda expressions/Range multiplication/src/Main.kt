
val lambda: (Long, Long) -> Long = { x, y -> (x..y).reduce { a, b -> a * b } }
