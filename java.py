import os
import subprocess

# Define the Git repository details
git_repo_path = r"E:\JAVA\GITHUB JAVA\java-150"
git_branch = "main"
commit_message = "Practice questions"

def git_add_commit_push():
    """Add all modified and untracked files, pull remote changes, commit, and push changes to Git."""
    os.chdir(git_repo_path)

    try:
        # Add all changes (including tracked and untracked files)
        subprocess.run(["git", "add", "."], check=True)

        # Check for changes
        result = subprocess.run(["git", "status", "--porcelain"], capture_output=True, text=True, check=True)
        changes = result.stdout.strip()

        if changes:
            subprocess.run(["git", "commit", "-m", commit_message], check=True)

        # Pull latest changes from remote (rebase to avoid merge commits)
        subprocess.run(["git", "pull", "--rebase", "origin", git_branch], check=True)

        # Push committed changes
        if changes:
            subprocess.run(["git", "push", "origin", git_branch], check=True)
            print("🚀 All changes committed and pushed successfully.")
        else:
            print("✅ No new changes to push after pulling latest updates.")

    except subprocess.CalledProcessError as e:
        print(f"❌ Git operation failed: {e}")

if __name__ == "__main__":
    git_add_commit_push()
