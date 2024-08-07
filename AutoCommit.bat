@echo off
cd /d "E:\@Coding\Git Repo Sync\HackerRank"
git add .
git commit -m "Auto-commit: %date% %time%"
git push origin main