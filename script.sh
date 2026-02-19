PROJECTS_DIR=~/newand
DEST_DIR=~/android_lab

for project in "$PROJECTS_DIR"/*; do
    if [ -d "$project" ]; then
        project_name=$(basename "$project")
        mkdir -p "$DEST_DIR/$project_name"

        # Find MainActivity.java
        find "$project" -type f -name "MainActivity.java" -exec cp {} "$DEST_DIR/$project_name/" \;

        # Find main.xml
        find "$project" -type f -name "activity_main.xml" -exec cp {} "$DEST_DIR/$project_name/main.xml" \;
    fi
done
