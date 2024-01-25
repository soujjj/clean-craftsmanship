.PHONY: test format check-format

test:
	./gradlew test

format:
	./gradlew goJF

check-format:
	./gradlew verGJF
