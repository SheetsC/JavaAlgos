class Star:
    def __init__(self, name, distance):
        self.name = name
        self.distance = distance
    
    def findNearestStar(self, stars, k):
        if isinstance(k, int):
            stars.sort(key=lambda star: star.distance)
            nearest_stars = stars[:k]
            return nearest_stars