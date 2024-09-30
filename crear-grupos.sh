#!/bin/bash

# Original repository details
ORIGINAL_REPO_DIR="/Users/juan/dev/unican/App-Gasolineras-2024"
ORIGINAL_REPO_URL="https://github.com/isunican/App-Gasolineras-2024"

# Number of copies to create
NUM_COPIES=5

# Iterate and create copies
for (( i=1; i<=NUM_COPIES; i++ )); do

    # New repository name
    NEW_REPO_NAME="App-Gasolineras-2024-Grupo$i"

    # Clone the original repository
    git clone "$ORIGINAL_REPO_DIR" "$NEW_REPO_NAME"

    # Enter the newly cloned repository
    cd "$NEW_REPO_NAME"

    # Replace the string in all files
    find . -type f -exec sed -i '' "s/App-Gasolineras-2024/$NEW_REPO_NAME/g" {} \;

    # Create a new GitHub repository (corrected)
    gh repo create isunican/"$NEW_REPO_NAME" --public --description "Copy of App-Gasolineras-2024 for Grupo $i" 

    # Add the new remote
    git remote add origin "https://github.com/isunican/$NEW_REPO_NAME.git"

    # Commit the changes
    git add .
    git commit -m "Replaced 'App-Gasolineras-2024' with '$NEW_REPO_NAME'"

    # Push the changes
    git push -u origin main

    # Go back to the original directory
    cd ..

done

echo "All repositories created and pushed successfully!"