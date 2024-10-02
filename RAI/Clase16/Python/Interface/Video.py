from abc import ABC, abstractmethod

class Video(ABC):
    @abstractmethod
    def ver_video(self):
        pass