FROM openjdk:17
WORKDIR /app
COPY . /app
RUN javac Main.java  # ✅ Ensures Java compiles before running
CMD ["java", "Main"]

